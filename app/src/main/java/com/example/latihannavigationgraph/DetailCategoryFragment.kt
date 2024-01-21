package com.example.latihannavigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.latihannavigationgraph.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {
    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Wihout SafeArgs
//        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
//        val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        //With SafeArgs
        val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDescription = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock: $dataDescription"

        binding.btnHome.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_detailCategoryFragment_to_homeFragment)
        )
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}