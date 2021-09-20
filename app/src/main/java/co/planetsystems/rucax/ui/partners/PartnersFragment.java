package co.planetsystems.rucax.ui.partners;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import co.planetsystems.rucax.databinding.FragmentPartnersBinding;


public class PartnersFragment extends Fragment {

    private PartnersViewModel notificationsViewModel;
    private FragmentPartnersBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(PartnersViewModel.class);

        binding = FragmentPartnersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}