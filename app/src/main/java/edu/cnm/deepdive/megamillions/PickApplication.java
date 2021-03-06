package edu.cnm.deepdive.megamillions;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.megamillions.db.PickDatabase;

public class PickApplication extends Application {

  private  PickDatabase database;

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
    PickDatabase.getInstance(this);
    database = PickDatabase.getInstance(this);
  }

  @Override
  public void onTerminate() {
    PickDatabase.forgetInstance();
    super.onTerminate();
  }

}
