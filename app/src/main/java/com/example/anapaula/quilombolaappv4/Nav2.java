package com.example.anapaula.quilombolaappv4;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Nav2 extends Fragment {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<Integer>> listHash;


    public Nav2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav2, container, false);
    }

    public void onViewCreated(View view, Bundle saveInstanceState)
    {
        listView = (ExpandableListView)getView().findViewById(R.id.lvExp);
        initializeData();
        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initializeData()
    {
        Integer layoutQuilombosPortoAlegre = R.layout.layout_quilombos_porto_alegre;
        Integer layoutQuilomboAlpes = R.layout.layout_quilombo_alpes;
        Integer layoutQuilomboAreal = R.layout.layout_quilombo_areal;
        Integer layoutQuilomboSilva = R.layout.layout_quilombo_silva;
        Integer layoutQuilomboFidelix = R.layout.layout_quilombo_fidelix;
        Integer layoutEntrevistas = R.layout.layout_entrevistas;

        listDataHeader = new ArrayList<String>();
        listHash = new HashMap<>();

        listDataHeader.add("Quilombos de Porto Alegre");
        listDataHeader.add("Quilombo Alpes");
        listDataHeader.add("Quilombo Areal");
        listDataHeader.add("Quilombo Silva");
        listDataHeader.add("Quilombo Fidélix");
        listDataHeader.add("Entrevistas");


        List<Integer> layoutList0 = new ArrayList<>();
        layoutList0.add(layoutQuilombosPortoAlegre);

        List<Integer> layoutList1 = new ArrayList<>();
        layoutList1.add(layoutQuilomboAlpes);

        List<Integer> layoutList2 = new ArrayList<>();
        layoutList2.add(layoutQuilomboAreal);

        List<Integer> layoutList3 = new ArrayList<>();
        layoutList3.add(layoutQuilomboSilva);

        List<Integer> layoutList4 = new ArrayList<>();
        layoutList4.add(layoutQuilomboFidelix);

        List<Integer> layoutList5 = new ArrayList<>();
        layoutList5.add(layoutEntrevistas);


        listHash.put(listDataHeader.get(0), layoutList0);
        listHash.put(listDataHeader.get(1), layoutList1);
        listHash.put(listDataHeader.get(2), layoutList2);
        listHash.put(listDataHeader.get(3), layoutList3);
        listHash.put(listDataHeader.get(4), layoutList4);
        listHash.put(listDataHeader.get(5), layoutList5);
    }
}