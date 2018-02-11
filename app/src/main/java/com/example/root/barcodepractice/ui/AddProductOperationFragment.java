package com.example.root.barcodepractice.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.root.barcodepractice.R;
import com.example.root.barcodepractice.base.BaseFragment;
import com.example.root.barcodepractice.models.ProductKirimChiqim;
import com.example.root.barcodepractice.utils.DatabeseManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

/**
 * Created by root on 2/12/18.
 */

public class AddProductOperationFragment extends BaseFragment {
    @BindView(R.id.tvTotal)
    TextView tvTotal;
    @BindView(R.id.spBuyType)
    AppCompatSpinner spBuyType;
    @BindView(R.id.spFrom)
    AppCompatSpinner spFrom;
    @BindView(R.id.etBarcode)
    TextInputEditText etBarcode;
    @BindView(R.id.etCount)
    TextInputEditText etCount;
    @BindView(R.id.etDate)
    TextInputEditText etDate;
    @BindView(R.id.etSell)
    TextInputEditText etSell;

    private DatabeseManager dbManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbManager = DatabeseManager.getInstace(getContext());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.add_product_operation, container,false);
        ButterKnife.bind(this, rootView);
        init();
        return rootView;
    }

    private void init() {
        // TODO: 2/12/18
    }

    @OnClick(R.id.btnSell)
    public void clickSell() {
        // TODO: 2/12/18
//        ProductKirimChiqim
    }
}
