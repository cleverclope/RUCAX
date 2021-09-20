package co.planetsystems.rucax.ui.partners;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PartnersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PartnersViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}