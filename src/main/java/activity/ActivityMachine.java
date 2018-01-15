package activity;

public class ActivityMachine {
  private static ActivityCluster activityCluster = new ActivityCluster();

  public static void record(Activity activity) {
    activityCluster.add(activity);
  }
}
