package handler;

/**
 * Created by shuo.sun on 2021/3/8.
 */
public class Activity {

    private TextView textView;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String text = (String) msg.obj;
            textView.setText(text);
        }
    };

    public void onCreate(){
        textView = new TextView();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message =  Message.obtain();
                message.obj = "数据";
                handler.sendMessage(message);
            }
        }).start();
    }

    public void onResume(){

    }
}
