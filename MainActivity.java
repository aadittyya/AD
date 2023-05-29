package com.example.webviewsameactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText editText;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.link);
        submit = findViewById(R.id.submit);
        webView = findViewById(R.id.web);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String link = String.valueOf(editText.getText());
                webView.loadUrl(link);
                webView.setWebViewClient(new WebViewClient());
            }
        });
    }
    public void onBackPressed(){
        webView = findViewById(R.id.web);
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}