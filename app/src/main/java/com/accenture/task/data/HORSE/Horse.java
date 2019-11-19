package com.accenture.task.data.HORSE;

import com.accenture.task.R;
import com.accenture.task.model.Item;

import java.util.ArrayList;

public class Horse {
    public ArrayList<Item> getHorseList() {
        ArrayList<Item> horseList = new ArrayList<>();
        horseList.add(new Item("Sergeant Reckless", R.drawable.sergeant_reckless, "Rating:7/10"));
        horseList.add(new Item("Comanche",R.drawable.comanche, "Rating: 8/10"));
        horseList.add(new Item("Cincinnati",R.drawable.cincinnati,"Rating 9/10"));
        return horseList;
    }

}
