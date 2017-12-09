package com.lccj.se_vira_em_frances.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.lccj.se_vira_em_frances.R;
import com.lccj.se_vira_em_frances.fragments.ColorsFragment;
import com.lccj.se_vira_em_frances.fragments.FamilyFragment;
import com.lccj.se_vira_em_frances.fragments.NumbersFragment;
import com.lccj.se_vira_em_frances.fragments.PhrasesFragment;

/**
 * Adapter to manage the content of the tab view
 */

public class CategoryAdapter extends FragmentPagerAdapter {

  private final int PAGE_COUNT = 4;

  private Context mContext;

  public CategoryAdapter(Context context, FragmentManager fm) {
    super(fm);
    mContext = context;
  }


  @Override
  public Fragment getItem(int position) {
    if (position == 0) {
      return new NumbersFragment();
    } else if (position == 1) {
      return new FamilyFragment();
    } else if (position == 2) {
      return new ColorsFragment();
    } else if (position == 3) {
      return new PhrasesFragment();
    }
    return null;
  }


  @Override
  public int getCount() {
    // Generate title based on item position
    return PAGE_COUNT;
  }

  @Override
  public CharSequence getPageTitle(int position) {
    if (position == 0) {
      return mContext.getString(R.string.category_numbers);
    } else if (position == 1) {
      return mContext.getString(R.string.category_family);
    } else if (position == 2) {
      return mContext.getString(R.string.category_colors);
    } else {
      return mContext.getString(R.string.category_phrases);
    }
  }
}
