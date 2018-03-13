package org.providence.danco.myapplication;

import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @BindView(R.id.password_layout)
    TextInputLayout mPasswordLayout;

    @BindView(R.id.password_view)
    TextInputEditText mPasswordView;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(getActivity(), view);

        mPasswordLayout = ButterKnife.findById(view, R.id.password_layout);
        mPasswordView = ButterKnife.findById(view, R.id.password_view);

        mPasswordLayout.setTypeface(ResourcesCompat.getFont(getActivity(), R.font.font_sourcesanspro_regular));

        return view;
    }
}
