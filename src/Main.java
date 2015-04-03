import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by arodriguez on 4/3/2015.
 */


public class Main extends JFrame {


    public Main() {

    }

    static public HashMap populateStory(){

        HashMap<String, StoryStep> map = new HashMap<>();


        StoryStep step = new StoryStep();
        step.setDescription("Things and stuff happen here");
        List<String> list = new ArrayList<>();
        list.add("The cat jumps on the couch ravenously");
        list.add("dog");
        step.setStoryOptions(list);
        step.setStepKey("start");
        map.put("start", step);



        StoryStep step2 = new StoryStep();
        step2.setDescription("DFDSFFSDFSDF");
        list = new ArrayList<>();
        list.add("Horse");
        list.add("Big dog");
        step2.setStoryOptions(list);
        step2.setImage("exit.png");
        step2.setStepKey("dog");
        map.put(step2.getStepKey(), step2);

        StoryStep step3 = new StoryStep();
        step3.setDescription("DFDSFFSDFSDF");
        list = new ArrayList<>();
        list.add("dog");
        list.add("option");
        step3.setStoryOptions(list);
        step3.setImage("testImage.jpg");
        step3.setStepKey("The cat jumps on the couch ravenously");
        map.put(step3.getStepKey(), step3);


        return map;
    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                HashMap<String, StoryStep> story = populateStory();




                CreateUI ex = new CreateUI(story);
                ex.setVisible(true);
            }
        });
    }
}