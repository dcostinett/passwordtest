package org.providence.danco.myapplication;


import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

public class EmailEditText extends TextInputEditText implements TextWatcher {

    public EmailEditText(Context context) {
        super(context);
        init();
    }

    public EmailEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EmailEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        super.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }

    @Override
    public void afterTextChanged(Editable editable) {
        String s = editable.toString();
        String lower = s.toLowerCase();
        if (!s.equals(lower)) {
            removeTextChangedListener(this);
            setText(lower);
            setSelection(getText().length());
            addTextChangedListener(this);
        }
    }
}
