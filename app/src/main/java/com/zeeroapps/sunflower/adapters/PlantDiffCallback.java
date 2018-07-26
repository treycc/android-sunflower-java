package com.zeeroapps.sunflower.adapters;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

import com.zeeroapps.sunflower.data.Plant;

import java.util.List;

public class PlantDiffCallback extends DiffUtil.Callback {

    private List<Plant> oldList;
    private List<Plant> newList;

    public PlantDiffCallback(List<Plant> oldList, List<Plant> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }


    @Override
    public int getOldListSize() {
        return this.oldList.size();
    }

    @Override
    public int getNewListSize() {
        return this.newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        Plant oldPlant = oldList.get(oldItemPosition);
        Plant newPlant = newList.get(newItemPosition);
        return oldPlant.getPlantId() == newPlant.getPlantId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        Plant oldPlant = oldList.get(oldItemPosition);
        Plant newPlant = newList.get(newItemPosition);
        return oldPlant.equals(newPlant);
    }

}
