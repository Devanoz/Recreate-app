// Generated by view binder compiler. Do not edit!
package org.tensorflow.codelabs.objectdetection.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.codelabs.objectdetection.R;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText emailTextfield;

  @NonNull
  public final TextView emailTextview;

  @NonNull
  public final ImageButton googleImageButton;

  @NonNull
  public final LinearProgressIndicator linearProgressBar;

  @NonNull
  public final TextInputLayout passwordTextInputLayout;

  @NonNull
  public final TextInputEditText passwordTextfield;

  @NonNull
  public final TextView repeatPasswordTextView;

  @NonNull
  public final TextInputEditText repeatPasswordTextfield;

  @NonNull
  public final MaterialButton signupButton;

  @NonNull
  public final TextInputLayout textInputLayout;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextInputEditText usernameTextfield;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText emailTextfield, @NonNull TextView emailTextview,
      @NonNull ImageButton googleImageButton, @NonNull LinearProgressIndicator linearProgressBar,
      @NonNull TextInputLayout passwordTextInputLayout,
      @NonNull TextInputEditText passwordTextfield, @NonNull TextView repeatPasswordTextView,
      @NonNull TextInputEditText repeatPasswordTextfield, @NonNull MaterialButton signupButton,
      @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2,
      @NonNull TextInputLayout textInputLayout3, @NonNull TextView textView3,
      @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6,
      @NonNull TextInputEditText usernameTextfield, @NonNull View view, @NonNull View view2) {
    this.rootView = rootView;
    this.emailTextfield = emailTextfield;
    this.emailTextview = emailTextview;
    this.googleImageButton = googleImageButton;
    this.linearProgressBar = linearProgressBar;
    this.passwordTextInputLayout = passwordTextInputLayout;
    this.passwordTextfield = passwordTextfield;
    this.repeatPasswordTextView = repeatPasswordTextView;
    this.repeatPasswordTextfield = repeatPasswordTextfield;
    this.signupButton = signupButton;
    this.textInputLayout = textInputLayout;
    this.textInputLayout2 = textInputLayout2;
    this.textInputLayout3 = textInputLayout3;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.usernameTextfield = usernameTextfield;
    this.view = view;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_textfield;
      TextInputEditText emailTextfield = rootView.findViewById(id);
      if (emailTextfield == null) {
        break missingId;
      }

      id = R.id.email_textview;
      TextView emailTextview = rootView.findViewById(id);
      if (emailTextview == null) {
        break missingId;
      }

      id = R.id.google_image_button;
      ImageButton googleImageButton = rootView.findViewById(id);
      if (googleImageButton == null) {
        break missingId;
      }

      id = R.id.linear_progress_bar;
      LinearProgressIndicator linearProgressBar = rootView.findViewById(id);
      if (linearProgressBar == null) {
        break missingId;
      }

      id = R.id.password_textInputLayout;
      TextInputLayout passwordTextInputLayout = rootView.findViewById(id);
      if (passwordTextInputLayout == null) {
        break missingId;
      }

      id = R.id.password_textfield;
      TextInputEditText passwordTextfield = rootView.findViewById(id);
      if (passwordTextfield == null) {
        break missingId;
      }

      id = R.id.repeat_password_textView;
      TextView repeatPasswordTextView = rootView.findViewById(id);
      if (repeatPasswordTextView == null) {
        break missingId;
      }

      id = R.id.repeat_password_textfield;
      TextInputEditText repeatPasswordTextfield = rootView.findViewById(id);
      if (repeatPasswordTextfield == null) {
        break missingId;
      }

      id = R.id.signup_button;
      MaterialButton signupButton = rootView.findViewById(id);
      if (signupButton == null) {
        break missingId;
      }

      id = R.id.textInputLayout;
      TextInputLayout textInputLayout = rootView.findViewById(id);
      if (textInputLayout == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = rootView.findViewById(id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = rootView.findViewById(id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.username_textfield;
      TextInputEditText usernameTextfield = rootView.findViewById(id);
      if (usernameTextfield == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = rootView.findViewById(id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, emailTextfield, emailTextview,
          googleImageButton, linearProgressBar, passwordTextInputLayout, passwordTextfield,
          repeatPasswordTextView, repeatPasswordTextfield, signupButton, textInputLayout,
          textInputLayout2, textInputLayout3, textView3, textView4, textView5, textView6,
          usernameTextfield, view, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
