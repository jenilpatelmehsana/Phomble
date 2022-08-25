package com.inspection.phomble.ui.PhotoHolderFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.inspection.phomble.R;

public class PhotoHolderFragment extends Fragment {

    private ImageView imageThumbnail;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_photo_holder, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageThumbnail = getView().findViewById(R.id.thumbnailImage);

        String imageLink = "https://images.unsplash.com/photo-1660480904370-a5dcd0be395b?crop=entropy\\\u0026cs=tinysrgb\\\u0026fit=max\\\u0026fm=jpg\\\u0026ixid=MnwzNTgzOTF8MHwxfHJhbmRvbXx8fHx8fHx8fDE2NjE0NTc0MzE\\\u0026ixlib=rb-1.2.1\\\u0026q=80\\\u0026w=1080";

        Glide.with(getView()).load(imageLink).into(imageThumbnail);
    }
}
