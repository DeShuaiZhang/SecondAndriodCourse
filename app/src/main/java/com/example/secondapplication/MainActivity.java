package com.example.secondapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] mStrs = {"这是第1行", "这是第2行", "这是第3行", "这是第4行", "这是第5行", "这是第6行", "这是第7行", "这是第8行", "这是第9行", "这是第10行"
            , "这是第11行", "这是第12行", "这是第13行", "这是第14行", "这是第15行", "这是第16行", "这是第17行", "这是第18行", "这是第19行"
            , "这是第20行", "这是第21行", "这是第22行", "这是第23行", "这是第24行", "这是第25行", "这是第26行", "这是第27行", "这是第28行", "这是第29行"
            , "这是第30行", "这是第31行", "这是第32行", "这是第33行", "这是第34行", "这是第35行", "这是第36行", "这是第37行", "这是第38行", "这是第39行"
            , "这是第40行", "这是第41行", "这是第42行", "这是第43行", "这是第44行", "这是第45行", "这是第46行", "这是第47行", "这是第48行", "这是第49行"
            , "这是第50行", "这是第51行", "这是第52行", "这是第53行", "这是第54行", "这是第55行", "这是第56行", "这是第57行", "这是第58行", "这是第59行"
            , "这是第60行", "这是第61行", "这是第62行", "这是第63行", "这是第64行", "这是第65行", "这是第66行", "这是第67行", "这是第68行", "这是第69行"
            , "这是第70行", "这是第71行", "这是第72行", "这是第73行", "这是第74行", "这是第75行", "这是第76行", "这是第77行", "这是第78行", "这是第79行"
            , "这是第80行", "这是第81行", "这是第82行", "这是第83行", "这是第84行", "这是第85行", "这是第86行", "这是第87行", "这是第88行", "这是第89行"
            , "这是第90行", "这是第91行", "这是第92行", "这是第93行", "这是第94行", "这是第95行", "这是第96行", "这是第97行", "这是第98行", "这是第99行"

    };
    private SearchView mSearchView;
    private ListView lListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearchView = (SearchView) findViewById(R.id.searchView);
        lListView = (ListView) findViewById(R.id.listView);
        lListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mStrs));
        lListView.setTextFilterEnabled(true);

        // 设置搜索文本监听
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            // 当点击搜索按钮时触发该方法
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            // 当搜索内容改变时触发该方法
            @Override
            public boolean onQueryTextChange(String newText) {
                if (!TextUtils.isEmpty(newText)){
                    lListView.setFilterText(newText);
                }else{
                    lListView.clearTextFilter();
                }
                return false;
            }
        });
    }
}