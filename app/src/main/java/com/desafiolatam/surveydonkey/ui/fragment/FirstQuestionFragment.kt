package com.desafiolatam.surveydonkey.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.desafiolatam.surveydonkey.databinding.FragmentFirstQuestionBinding
import com.desafiolatam.surveydonkey.viewmodel.MainViewModel

class FirstQuestionFragment : Fragment() {

    private var _binding: FragmentFirstQuestionBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.run {
            answer11.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(answer11.text.toString())
                else viewModel.removeFirstAnswer(answer11.text.toString())
            }
            answer12.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(answer12.text.toString())
                else viewModel.removeFirstAnswer(answer12.text.toString())
            }
            answer13.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(answer13.text.toString())
                else viewModel.removeFirstAnswer(answer13.text.toString())
            }
            answer14.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(answer14.text.toString())
                else viewModel.removeFirstAnswer(answer14.text.toString())
            }
            answer15.setOnCheckedChangeListener { _, checked ->
                if (checked) viewModel.addFirstAnswer(answer15.text.toString())
                else viewModel.removeFirstAnswer(answer15.text.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}