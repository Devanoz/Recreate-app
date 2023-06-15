// Generated by view binder compiler. Do not edit!
package org.tensorflow.codelabs.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.codelabs.objectdetection.R;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView articleCardView;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final CardView mainCardView;

  @NonNull
  public final LinearLayout middleSection;

  @NonNull
  public final ShapeableImageView profileImage;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView tvArticle;

  @NonNull
  public final TextView tvNumDetection;

  @NonNull
  public final TextView tvUsername;

  @NonNull
  public final TextView tvVideo;

  @NonNull
  public final TextView tvWelcome;

  @NonNull
  public final CardView videoCardView;

  private FragmentHomeBinding(@NonNull ScrollView rootView, @NonNull CardView articleCardView,
      @NonNull ImageView imageView3, @NonNull CardView mainCardView,
      @NonNull LinearLayout middleSection, @NonNull ShapeableImageView profileImage,
      @NonNull TextView textView2, @NonNull TextView textView7, @NonNull TextView tvArticle,
      @NonNull TextView tvNumDetection, @NonNull TextView tvUsername, @NonNull TextView tvVideo,
      @NonNull TextView tvWelcome, @NonNull CardView videoCardView) {
    this.rootView = rootView;
    this.articleCardView = articleCardView;
    this.imageView3 = imageView3;
    this.mainCardView = mainCardView;
    this.middleSection = middleSection;
    this.profileImage = profileImage;
    this.textView2 = textView2;
    this.textView7 = textView7;
    this.tvArticle = tvArticle;
    this.tvNumDetection = tvNumDetection;
    this.tvUsername = tvUsername;
    this.tvVideo = tvVideo;
    this.tvWelcome = tvWelcome;
    this.videoCardView = videoCardView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.article_cardView;
      CardView articleCardView = rootView.findViewById(id);
      if (articleCardView == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = rootView.findViewById(id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.main_cardView;
      CardView mainCardView = rootView.findViewById(id);
      if (mainCardView == null) {
        break missingId;
      }

      id = R.id.middle_section;
      LinearLayout middleSection = rootView.findViewById(id);
      if (middleSection == null) {
        break missingId;
      }

      id = R.id.profile_image;
      ShapeableImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = rootView.findViewById(id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = rootView.findViewById(id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.tv_article;
      TextView tvArticle = rootView.findViewById(id);
      if (tvArticle == null) {
        break missingId;
      }

      id = R.id.tv_num_detection;
      TextView tvNumDetection = rootView.findViewById(id);
      if (tvNumDetection == null) {
        break missingId;
      }

      id = R.id.tv_username;
      TextView tvUsername = rootView.findViewById(id);
      if (tvUsername == null) {
        break missingId;
      }

      id = R.id.tv_video;
      TextView tvVideo = rootView.findViewById(id);
      if (tvVideo == null) {
        break missingId;
      }

      id = R.id.tv_welcome;
      TextView tvWelcome = rootView.findViewById(id);
      if (tvWelcome == null) {
        break missingId;
      }

      id = R.id.video_cardView;
      CardView videoCardView = rootView.findViewById(id);
      if (videoCardView == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, articleCardView, imageView3,
          mainCardView, middleSection, profileImage, textView2, textView7, tvArticle,
          tvNumDetection, tvUsername, tvVideo, tvWelcome, videoCardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
