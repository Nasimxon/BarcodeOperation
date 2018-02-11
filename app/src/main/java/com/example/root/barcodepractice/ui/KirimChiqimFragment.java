package com.example.root.barcodepractice.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.barcodepractice.R;
import com.example.root.barcodepractice.base.BaseFragment;
import com.example.root.barcodepractice.utils.DatabeseManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by root on 2/12/18.
 */

public class KirimChiqimFragment extends BaseFragment {
    @BindView(R.id.rvData)
    RecyclerView rvData;

    private DatabeseManager dbManager;
    private int type;

    public static Fragment getInstance(int type) {
        Fragment fragment = new KirimChiqimFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type = getArguments().getInt("type", 0);
        dbManager = DatabeseManager.getInstace(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.kirim_chiqim_fragment, container, false);
        ButterKnife.bind(this, rootView);
        init();
        return rootView;
    }

    private void init() {
        rvData.setAdapter(new MyAdapter());
    }

    @OnClick(R.id.btnAdd)
    public void clickAdd() {
        //todo

    }

    private class MyAdapter extends RecyclerView.Adapter<MyHolder>{

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return dbManager.getProductOperationsByType(type).size();
        }
    }

    private class MyHolder extends RecyclerView.ViewHolder {

        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
