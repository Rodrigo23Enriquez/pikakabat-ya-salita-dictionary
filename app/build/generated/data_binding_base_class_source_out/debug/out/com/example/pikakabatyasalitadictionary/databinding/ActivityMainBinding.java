// Generated by view binder compiler. Do not edit!
package com.example.pikakabatyasalitadictionary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pikakabatyasalitadictionary.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final TextView dic;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final TextView pangeng;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull Button button,
      @NonNull Button button2, @NonNull TextView dic, @NonNull DrawerLayout drawerLayout,
      @NonNull TextView pangeng) {
    this.rootView = rootView;
    this.button = button;
    this.button2 = button2;
    this.dic = dic;
    this.drawerLayout = drawerLayout;
    this.pangeng = pangeng;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
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
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.dic;
      TextView dic = ViewBindings.findChildViewById(rootView, id);
      if (dic == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.pangeng;
      TextView pangeng = ViewBindings.findChildViewById(rootView, id);
      if (pangeng == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, button, button2, dic, drawerLayout,
          pangeng);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}