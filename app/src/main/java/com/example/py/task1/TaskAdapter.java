package com.example.py.task1;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;


    public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {
        private List<User> users;


        public static class MyViewHolder extends RecyclerView.ViewHolder {

            TextView textView, textView2, textView3;

            public MyViewHolder(View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.textView);
                textView2 = itemView.findViewById(R.id.textView2);
                textView3 = itemView.findViewById(R.id.textView3);
            }
        }

        public TaskAdapter(List<User> users){
            this.users = users;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.task_layout, parent, false);
            return new MyViewHolder(view);
        }


        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            User user = users.get(position);
            holder.textView.setText(user.getName());
            holder.textView2.setText(user.getOccup());
            holder.textView3.setText(user.getAge());

        }

        @Override
        public int getItemCount() {
            if (users == null) {
                return 0;
            }
            return users.size();
        }
    }
