package com.wmi.nativelang;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.wmi.simplefunfacts.R;

import java.util.ArrayList;

/**
 * Created by gurvinder on 1/15/18.
 */

public class NativeLangAdapter extends ArrayAdapter<NativeWord> {

    public NativeLangAdapter(Activity context, ArrayList<NativeWord> nativeLangWord) {
        super(context, 0, nativeLangWord);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;

        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        NativeWord currentWord = getItem(position);

        TextView translatedTextView = (TextView) listView.findViewById(R.id.simple_text_view);
        translatedTextView.setText(currentWord.getTranslatedWord());

        TextView defaultTextView = (TextView) listView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listView;
    }
}
