package com.corentindupont.messagerie.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.corentindupont.messagerie.Fragment.AccountFragment;
import com.corentindupont.messagerie.Fragment.ContactsFragment;
import com.corentindupont.messagerie.Fragment.DiscussionsFragment;

/**
 * Created by Corentin on 08/03/2018.
 */

public class MessagingPagerAdapter extends FragmentStatePagerAdapter {

    //Constructor
    public MessagingPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //display correct fragment
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DiscussionsFragment();
            case 1:
                return new ContactsFragment();
            case 2:
                return new AccountFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    //Display tab layout labels
    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Discussions";
            case 1:
                return "Contacts";
            case 2:
                return "Compte";
            default:
                return "non définie";
        }
    }
}
