package org.arkochatterjee.motionsensornotification;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

/**
 * Created by Arko Chatterjee on 08-11-2017.
 */

public class MessageAdapter extends ArrayAdapter<MotionDetect> {
public MessageAdapter(Context context, int resource, List<MotionDetect> objects) {
        super(context, resource, objects);
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
        convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);

         MotionDetect message = getItem(position);

        //boolean isPhoto = message.getPhotoUrl() != null;

        messageTextView.setVisibility(View.VISIBLE);
        photoImageView.setVisibility(View.GONE);
        messageTextView.setText(message.getText());

        authorTextView.setText(message.getName());

        return convertView;
        }
        }