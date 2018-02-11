package com.example.root.barcodepractice.utils;

import android.content.Context;

import com.example.root.barcodepractice.App;
import com.example.root.barcodepractice.models.DaoSession;
import com.example.root.barcodepractice.models.ProductKirimChiqim;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nasimxon on 2/12/18.
 */

public class DatabeseManager {
    private DaoSession mDaoSession;
    private static DatabeseManager instance;

    private DatabeseManager() {
    }

    private DatabeseManager(Context context) {
        mDaoSession = ((App) context).getmDaoSession();
    }

    public static DatabeseManager getInstace(Context context) {
        if (instance == null)
            instance = new DatabeseManager(context);
        return instance;
    }

    public void addProduct(ProductKirimChiqim productOperation) {
        mDaoSession.getProductKirimChiqimDao().insertOrReplace(productOperation);
    }

    public List<ProductKirimChiqim> getProductOperationsByType(int type) {
        List<ProductKirimChiqim> data = mDaoSession.getProductKirimChiqimDao().loadAll();
        List<ProductKirimChiqim> result = new ArrayList<>();
        for (ProductKirimChiqim datum : data) {
            if (datum.getType() == type)
                result.add(datum);
        }
        return result;
    }

}
