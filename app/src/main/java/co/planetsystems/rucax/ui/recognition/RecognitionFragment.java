package co.planetsystems.rucax.ui.recognition;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import co.planetsystems.rucax.databinding.FragmentRecognitionBinding;

public class RecognitionFragment extends Fragment {

    private RecognitionViewModel recognitionViewModel;
    private FragmentRecognitionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recognitionViewModel = new ViewModelProvider(this).get(RecognitionViewModel.class);

        binding = FragmentRecognitionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}