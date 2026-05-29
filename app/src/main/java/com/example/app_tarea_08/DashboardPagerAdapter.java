package com.example.app_tarea_08.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.app_tarea_08.fragments.AritmeticaFragment;
import com.example.app_tarea_08.fragments.AreasFragment;
import com.example.app_tarea_08.fragments.PerimetrosFragment;
import com.example.app_tarea_08.fragments.ConversionesFragment;

public class DashboardPagerAdapter extends FragmentStateAdapter {

    public DashboardPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new AritmeticaFragment();
            case 1: return new AreasFragment();
            case 2: return new PerimetrosFragment();
            case 3: return new ConversionesFragment();
            default: return new AritmeticaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}