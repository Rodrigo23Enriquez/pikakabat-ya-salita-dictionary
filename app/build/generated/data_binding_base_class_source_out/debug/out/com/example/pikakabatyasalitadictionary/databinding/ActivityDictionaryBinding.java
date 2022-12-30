// Generated by view binder compiler. Do not edit!
package com.example.pikakabatyasalitadictionary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.example.pikakabatyasalitadictionary.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityDictionaryBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final DrawerLayout drawerLayout;

  private ActivityDictionaryBinding(@NonNull DrawerLayout rootView,
      @NonNull DrawerLayout drawerLayout) {
    this.rootView = rootView;
    this.drawerLayout = drawerLayout;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDictionaryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDictionaryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_dictionary, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDictionaryBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    DrawerLayout drawerLayout = (DrawerLayout) rootView;

    return new ActivityDictionaryBinding((DrawerLayout) rootView, drawerLayout);
  }
}
