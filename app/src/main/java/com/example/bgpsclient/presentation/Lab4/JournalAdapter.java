package com.example.bgpsclient.presentation.Lab4;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bgpsclient.R;
import com.example.bgpsclient.domain.model.JournalRecord;

import java.util.List;

class JournalAdapter extends RecyclerView.Adapter<JournalAdapter.JournalViewHolder> {
    private List<JournalRecord> mRecords;

    public JournalAdapter(@NonNull List<JournalRecord> records) {
        mRecords = records;
    }

    @NonNull
    @Override
    public JournalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lab_4_adapter, parent, false);
        return new JournalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JournalViewHolder holder, int position) {
        holder.bindView(mRecords.get(position));
    }

    @Override
    public int getItemCount() {
        return mRecords.size();
    }

    static class JournalViewHolder extends RecyclerView.ViewHolder {
        private TextView mId;
        private TextView mFullName;
        private TextView mMarkType;
        private TextView mSubjectName;
        private TextView mCount;


        public JournalViewHolder(@NonNull View itemView) {
            super(itemView);
            mId = itemView.findViewById(R.id.record_id);
            mFullName = itemView.findViewById(R.id.record_full_name);
            mMarkType = itemView.findViewById(R.id.record_mark_type);
            mSubjectName = itemView.findViewById(R.id.record_subject_name);
        }

        void bindView(final JournalRecord journalRecord) {
            mId.setText(String.valueOf(journalRecord.getId()));
            mFullName.setText(journalRecord.getStudentFulName());
            if (Integer.parseInt(journalRecord.getMarkValue()) <= 3) {
                mMarkType.setBackgroundColor(Color.RED);
            }

            StringBuilder mark = new StringBuilder(journalRecord.getMarkName());
            mark.append(" П:").append(journalRecord.getCount());
            mSubjectName.setText(journalRecord.getSubjectShortName());
            mMarkType.setText(mark);
        }
    }
}
