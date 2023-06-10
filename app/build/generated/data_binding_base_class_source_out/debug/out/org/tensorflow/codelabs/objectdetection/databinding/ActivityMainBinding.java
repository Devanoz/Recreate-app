// Generated by view binder compiler. Do not edit!
package org.tensorflow.codelabs.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.codelabs.objectdetection.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cardViewArticle;

  @NonNull
  public final CardView cardViewVideo;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RecyclerView labelRv;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull CardView cardViewArticle,
      @NonNull CardView cardViewVideo, @NonNull FrameLayout frameLayout,
      @NonNull ImageView imageView, @NonNull RecyclerView labelRv) {
    this.rootView = rootView;
    this.cardViewArticle = cardViewArticle;
    this.cardViewVideo = cardViewVideo;
    this.frameLayout = frameLayout;
    this.imageView = imageView;
    this.labelRv = labelRv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView_article;
      CardView cardViewArticle = rootView.findViewById(id);
      if (cardViewArticle == null) {
        break missingId;
      }

      id = R.id.cardView_video;
      CardView cardViewVideo = rootView.findViewById(id);
      if (cardViewVideo == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = rootView.findViewById(id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.label_rv;
      RecyclerView labelRv = rootView.findViewById(id);
      if (labelRv == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, cardViewArticle, cardViewVideo,
          frameLayout, imageView, labelRv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
