package com.romainpotier.ewokswatch.activity;

import com.romainpotier.ewokswatch.R;
import com.romainpotier.ewokswatch.adapter.BaseListAdapter;
import com.romainpotier.ewokswatch.adapter.RefreshPicturesListAdapter;
import com.romainpotier.ewokswatch.preferences.SharedPrefManager;

public class RefreshPicturesListActivity extends BaseListActivity<Long> {

    @Override
    protected BaseListAdapter<Long> getBaseListAdapter() {
        return new RefreshPicturesListAdapter(this, SharedPrefManager.getInstance(this).getRefreshTime());
    }

    @Override
    protected int getHeader() {
        return R.string.refresh_pictures;
    }

}
