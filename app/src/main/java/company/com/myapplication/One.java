package company.com.myapplication;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class One extends Fragment {


    public One() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);
        VideoView videoView=(VideoView)view.findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("http://images.all-free-download.com/footage_preview/webm/waterscape_46.webm"));
        videoView.start();

        return view;

    }

}
