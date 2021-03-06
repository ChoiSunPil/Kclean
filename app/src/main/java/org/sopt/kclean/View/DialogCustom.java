package org.sopt.kclean.View;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.sopt.kclean.R;

/**
 * Created by choisunpil on 14/11/2018.
 */

public class DialogCustom extends Dialog {
    private static final int LAYOUT = R.layout.dialog_custom;
    private Context context;
    private String text;
    private ImageButton button;
    private TextView textView;
    private RelativeLayout layout;

    public DialogCustom(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    public DialogCustom(@NonNull Context context,String text) {
        super(context);
        this.context = context;
        this.text = text;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        button = (ImageButton) findViewById(R.id.notice_button);
        textView = (TextView) findViewById(R.id.dialog_text);
        layout = (RelativeLayout) findViewById(R.id.dialog_style);

        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        textView.setText(text);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
