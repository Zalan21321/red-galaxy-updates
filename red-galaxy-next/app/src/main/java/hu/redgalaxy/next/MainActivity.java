package hu.redgalaxy.next;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.LinkedHashSet;

/** Initial settings screen. No screen capture or game automation is implemented. */
public final class MainActivity extends Activity {
    private EditText names;
    private EditText duration;
    private SharedPreferences preferences;
    private LinearLayout content;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        preferences = getSharedPreferences("profile", MODE_PRIVATE);
        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true);
        scroll.setBackgroundColor(0xFF10131D);
        content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(dp(24), dp(24), dp(24), dp(24));
        scroll.addView(content);
        scroll.setOnApplyWindowInsetsListener((view, insets) -> {
            view.setPadding(insets.getSystemWindowInsetLeft(), insets.getSystemWindowInsetTop(),
                insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
            return insets;
        });
        setContentView(scroll);
        scroll.requestApplyInsets();

        label("RED GALAXY NEXT", 14, 0xFFFF726D);
        label("Saját profil", 30, 0xFFF1F3FA);
        label("Fejlesztői alap • 0.1.0-dev", 14, 0xFFBAC0D0);
        label("Ez a változat a beállításokat menti. A képfelismerés és a játékvezérlés még nincs beépítve.", 16, 0xFFBAC0D0);

        label("NPC-nevek", 18, 0xFFF1F3FA);
        label("Soronként egy nevet adj meg. Az ismétlődő neveket mentéskor összevonjuk.", 14, 0xFFBAC0D0);
        names = new EditText(this);
        names.setId(R.id.npc_names);
        names.setHint("NPC neve");
        names.setContentDescription("NPC-nevek, soronként egy");
        names.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        names.setMinLines(5);
        names.setGravity(android.view.Gravity.TOP);
        names.setText(preferences.getString("names", ""));
        add(names);

        label("Tervezett menetidő (másodperc)", 18, 0xFFF1F3FA);
        duration = new EditText(this);
        duration.setId(R.id.session_duration);
        duration.setContentDescription("Menetidő másodpercben, 1 és 120 között");
        duration.setInputType(InputType.TYPE_CLASS_NUMBER);
        duration.setText(Integer.toString(preferences.getInt("duration", 30)));
        add(duration);

        Button save = new Button(this);
        save.setText("Profil mentése");
        save.setOnClickListener(v -> saveProfile());
        add(save);
        label("A profil ezen a telefonon marad. A régi alkalmazás mellett külön telepíthető.", 14, 0xFFBAC0D0);
    }

    private void saveProfile() {
        final int seconds;
        try { seconds = Integer.parseInt(duration.getText().toString().trim()); }
        catch (NumberFormatException error) {
            duration.setError("Adj meg egy egész számot 1 és 120 között.");
            return;
        }
        if (seconds < 1 || seconds > 120) {
            duration.setError("A menetidő 1–120 másodperc lehet.");
            return;
        }
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        for (String line : names.getText().toString().split("\\r?\\n")) {
            String name = line.trim();
            if (!name.isEmpty()) unique.add(name);
        }
        String normalized = String.join("\n", unique);
        preferences.edit().putString("names", normalized).putInt("duration", seconds).apply();
        names.setText(normalized);
        Toast.makeText(this, "Profil mentve", Toast.LENGTH_SHORT).show();
    }

    private void label(String text, int size, int color) {
        TextView label = new TextView(this);
        label.setText(text);
        label.setTextSize(size);
        label.setTextColor(color);
        add(label);
    }

    private void add(View view) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(-1, -2);
        params.bottomMargin = dp(16);
        content.addView(view, params);
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }
}
