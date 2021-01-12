package ACMTeam;

public class Solution {
    static int[] acmTeam(String[] topic){
        int[] result = {0,0};

        int topicSize = topic.length;
        int maxTopic = 0;

        for(int i=0; i<topicSize-1; i++){
            for (int j=i+1; j<topicSize; j++){
                String element1 = topic[i];
                String element2 = topic[j];

                int numberOfTopics = 0;
                for (int index=0; index<element1.length(); index++){
                    int char1 = Character.getNumericValue(element1.charAt(index));
                    int char2 = Character.getNumericValue(element2.charAt(index));
                    if (char1==1 || char2==1){
                        numberOfTopics++;
                    }
                }
                if (maxTopic==numberOfTopics)
                    result[1] += 1;
                else if (maxTopic<numberOfTopics){
                    maxTopic = numberOfTopics;
                    result[0] = maxTopic;
                    result[1] = 1;
                }
            }
        }

        return result;
    }
}
