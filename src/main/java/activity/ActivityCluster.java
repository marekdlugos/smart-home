package activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCluster {
  private List<Activity> activities = new ArrayList<Activity>();

  public void add(Activity activity) {
    activities.add(activity);
  }
}
