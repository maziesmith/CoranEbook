package com.oukache.coranebook.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.oukache.coranebook.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Oukache on 24/04/2015.
 */
public class DouaFragment extends Fragment {

	@InjectView(R.id.title_bar_layout) LinearLayout _titleBar;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);

		View root = inflater.inflate(R.layout.fragment_doua, container, false);
		ButterKnife.inject(this, root);


		((TextView) _titleBar.findViewById(R.id.title_bar_tv_title)).setText("Doua");

		return root;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		ButterKnife.reset(this);
	}

}