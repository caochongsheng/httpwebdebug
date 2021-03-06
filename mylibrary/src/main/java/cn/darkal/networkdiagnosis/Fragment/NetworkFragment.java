package cn.darkal.networkdiagnosis.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cn.darkal.networkdiagnosis.R;
import cn.darkal.networkdiagnosis.Task.DnsTask;
import cn.darkal.networkdiagnosis.Task.InfoTask;
import cn.darkal.networkdiagnosis.Task.PingTask;
import cn.darkal.networkdiagnosis.Task.TraceTask;

public class NetworkFragment extends BaseFragment {

    Button pingButton;

    Button dnsButton;

    Button traceButton;

    Button infoButton;


    TextView resultTextView;


    EditText urlEditText;

    static NetworkFragment networkFragment;

    public static NetworkFragment getInstance() {
        if(networkFragment == null){
            networkFragment = new NetworkFragment();
        }
        return networkFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_network, container, false);

        pingButton = (Button) view.findViewById(R.id.bt_ping);
        dnsButton = (Button) view.findViewById(R.id.bt_dns);
        traceButton = (Button) view.findViewById(R.id.bt_trace);
        infoButton = (Button) view.findViewById(R.id.bt_info);
        resultTextView = (TextView) view.findViewById(R.id.tv_result);
        urlEditText = (EditText) view.findViewById(R.id.et_url);

        // 暂时隐藏两个按钮
        pingButton.setVisibility(View.GONE);
        dnsButton.setVisibility(View.GONE);

        pingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PingTask pingTask = new PingTask(urlEditText.getText()+"",resultTextView);
                pingTask.doTask();
            }
        });

        dnsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DnsTask pingTask = new DnsTask(urlEditText.getText()+"",resultTextView);
                pingTask.doTask();
            }
        });

        traceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TraceTask pingTask = new TraceTask(getActivity(),urlEditText.getText()+"",resultTextView);
                pingTask.doTask();
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InfoTask pingTask = new InfoTask(urlEditText.getText()+"",resultTextView);
                pingTask.doTask();
            }
        });

        return view;
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
