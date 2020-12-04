package android.bignerdranch.com;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
//import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private ImageButton mNextButton;
    private ImageButton mBackButton;
    private TextView mQuestionTextView;
    private static final String TAG="MainActivity";
    private Question[] mQuestionsBank=new Question[]{
            new Question(R.string.question_oceans,true),
            new Question(R.string.question_mideast,false),
            new Question(R.string.question_africa,false),
            new Question(R.string.question_americas,true),
            new Question(R.string.question_asia,true),
    };
    private int mCurrentIndex=0;

    private void updateQuestion(){
        int question=mQuestionsBank[mCurrentIndex].getTextReaetId();
        mQuestionTextView.setText(question);
    }

    private void checkAnswer(boolean userPressTrue){
        boolean answerIsTrue=mQuestionsBank[mCurrentIndex].isAnswerTrue();

        int messageResId = 0;
        if(userPressTrue==answerIsTrue){
            messageResId=R.string.correct_toast;
        }else{
            messageResId=R.string.incorrect_toast;
        }
        Toast.makeText(this,messageResId,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate(Bundle) called");
//        setContentView方法生成指定布局的视图并将其放置在屏幕上，布局生成后每个组件也随之以各自的属性定义完成实例化
//        布局是一种资源，资源是应用非代码形式的内容，该项目定义的布局资源ID为R.layout.activity_main
//        R文件在Android项目编译过程中自动生成，不能修改

//        setContentView(R.layout.activity_main)这行代码，来将指定的资源xml文件加载到对应的activity中

        setContentView(R.layout.activity_main);
//        使用按钮组件，需要以下两个步骤：
//        引用生成的视图对象
//        为对象设置监听器，以响应用户操作
//        引用组件，用findViewById
//        设置监听器（使用内部匿名类）
//        传入setOnClickListener方法的监听器参数时一个匿名内部类，这样做有两大好处：diyi8，我们可以在同一处实现监听方法，代码清晰可；第二，可以避免不必要的命名类实现
        mQuestionTextView=findViewById(R.id.question_text_view);
        mTrueButton = findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                //Does nothing yet, but soon!
//
                checkAnswer(true);
            }
        });

        mFalseButton =  findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Does nothing yet, but soon!
//                Toast t= Toast.makeText(MainActivity.this,R.string.incorrect_toast,Toast.LENGTH_SHORT);
//                t.setGravity(Gravity.TOP,0,0);
//                t.show();
                checkAnswer(false);
            }
        });

        mNextButton=findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex=(mCurrentIndex+1)%mQuestionsBank.length;
                updateQuestion();
            }
        });

        mBackButton=findViewById(R.id.back_button);
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex=(mCurrentIndex-1)%mQuestionsBank.length;
                updateQuestion();
            }
        });
        updateQuestion();
    }
//    使用Override可以要求编译器保证当前类具有你要覆盖的方法，如果你的函数发生拼写错误，编译器会提示你没有从父类覆盖该方法
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart() called");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause() called");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"onResume() called");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"onStop() called");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
    }
}
