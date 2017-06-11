package com.sourcey.materiallogindemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sourcey.materiallogindemo.R;
import com.sourcey.materiallogindemo.model.EventModel;

import java.util.ArrayList;

/**
 * Created by next on 11/6/17.
 */
public class ModuleCardadapter extends RecyclerView.Adapter<ModuleCardadapter.MyViewholder> {
    ArrayList<EventModel> eventModelArrayList;
    Context mContext;
    public ModuleCardadapter(Context context, ArrayList<EventModel> eventModels){
        this.mContext = context;
        this.eventModelArrayList = eventModels;

    }
    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event_layout, parent, false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
EventModel model = eventModelArrayList.get(position);
        //data obtained is set here
    }

    @Override
    public int getItemCount() {
        return eventModelArrayList.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView eventType, eventName, eventDate, eventDay, eventTime, eventVenue, eventPay;
        public MyViewholder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image_event);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
            eventName = (TextView) itemView.findViewById(R.id.eventName);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
            eventType = (TextView) itemView.findViewById(R.id.eventType);
        }
    }
}
