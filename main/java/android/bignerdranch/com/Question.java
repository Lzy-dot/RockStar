package android.bignerdranch.com;
//MVC设计模式（Model-View-controller）模型-控制器-视图

public class Question {
    private int mTextReaetId;
    private boolean mAnswerTrue;

    public int getTextReaetId() {
        return mTextReaetId;
    }

    public void setTextReaetId(int textReaetId) {
        mTextReaetId = textReaetId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue){
        mTextReaetId=textResId;
        mAnswerTrue=answerTrue;
    }
}
