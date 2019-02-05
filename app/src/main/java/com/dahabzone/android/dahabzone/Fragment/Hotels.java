package com.dahabzone.android.dahabzone.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dahabzone.android.dahabzone.Adapter.Hotels_Adapter;
import com.dahabzone.android.dahabzone.Datatype.Hotels_Datatype;
import com.dahabzone.android.dahabzone.Interfaces.ItemClickListener;
import com.dahabzone.android.dahabzone.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Hotels extends Fragment implements ItemClickListener {
    @BindView(R.id.hotelsrecycalview)
    RecyclerView recyclerView;
    @BindView(R.id.hotels_image)
    ImageView hotels_image;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.phone)
    TextView phone;
    @BindView(R.id.description)
    TextView description;
    List<Hotels_Datatype> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.hotels,container,false);
        ButterKnife.bind(this, view);
        data = new ArrayList<>();
        data.add(new Hotels_Datatype("AQUA DIVERS","AQUA DIVERS is situated within a 3 stars hotel with private swimming pool on Mashraba beach in Dahab, overlooking the Gulf of Aqaba.As a company, we pride ourselves in providing the highest personal and professional service to our guests in a relaxing environment.We offer a complete range of diving packages, safaris and PADI courses from your first breaths to dive professional, as well as accommodation to suit most budgets. Our team of friendly staff and experienced, multilingual instructors will ensure your diving adventure is both safe and fun.","0100 238 3830","Aqua Divers Dahab, 122, Qesm Saint Katrin, Egypt",R.drawable.aqua));
        data.add(new Hotels_Datatype("Tarakhan Hotel","Tarakhan Hotel is ideally located in the heart of Dahab Bay, directly overlooking the Gulf of Aqaba. It offers a variety of outdoor activities.It is beautifully hotel location. All air-conditioned rooms and  some rooms have sea views from private balconies, satellite TV, private toilet, and a fridge.Guests can enjoy riding camels, horses, beach buggies, and bicycles. Alternatively, there are short trips, safari and water sports at the nearby beach.","0100 238 3830","Tarakhan hotel, Qesm Saint Katrin, Egypt",R.drawable.tarakhan));
        Hotels_Adapter adapter;
        adapter = new Hotels_Adapter(getContext(), data);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) mLayoutManager).setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setClickListener(this);

        //-------------------------------------
        name.setText( data.get(0).getName());
        hotels_image.setImageResource(data.get(0).getImage());
        phone.setText( data.get(0).getPhone());
        description.setText( data.get(0).getDescription());

        return view;

    }

    @Override
    public void onClick(View view, int position) {
        name.setText( data.get(position).getName());
        hotels_image.setImageResource(data.get(position).getImage());
        phone.setText( data.get(position).getPhone());
        description.setText( data.get(position).getDescription());
    }
}
