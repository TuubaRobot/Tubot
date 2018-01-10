// Generated code from Butter Knife. Do not modify!
package com.tobot.tobot;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131624054;

  private View view2131624055;

  private View view2131624060;

  private View view2131624061;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.account = Utils.findRequiredViewAsType(source, R.id.ed_account, "field 'account'", EditText.class);
    target.password = Utils.findRequiredViewAsType(source, R.id.ed_password, "field 'password'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_conn, "field 'btn_conn' and method 'send'");
    target.btn_conn = Utils.castView(view, R.id.btn_conn, "field 'btn_conn'", Button.class);
    view2131624054 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.send();
      }
    });
    target.tvConnResult = Utils.findRequiredViewAsType(source, R.id.tvConnResult, "field 'tvConnResult'", TextView.class);
    target.tvASR = Utils.findRequiredViewAsType(source, R.id.tvASR, "field 'tvASR'", TextView.class);
    target.im_picture = Utils.findRequiredViewAsType(source, R.id.im_picture, "field 'im_picture'", ImageView.class);
    target.editText = Utils.findRequiredViewAsType(source, R.id.etphone, "field 'editText'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_close, "method 'close'");
    view2131624055 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.close();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_shutdown1, "method 'shutdown1'");
    view2131624060 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.shutdown1();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_shutdown2, "method 'shutdown2'");
    view2131624061 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.shutdown2();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.account = null;
    target.password = null;
    target.btn_conn = null;
    target.tvConnResult = null;
    target.tvASR = null;
    target.im_picture = null;
    target.editText = null;

    view2131624054.setOnClickListener(null);
    view2131624054 = null;
    view2131624055.setOnClickListener(null);
    view2131624055 = null;
    view2131624060.setOnClickListener(null);
    view2131624060 = null;
    view2131624061.setOnClickListener(null);
    view2131624061 = null;
  }
}
