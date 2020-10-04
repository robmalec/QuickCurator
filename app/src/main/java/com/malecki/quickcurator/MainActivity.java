package com.malecki.quickcurator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.malecki.quickcurator.R;
import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.android.appremote.api.Connector;
import com.spotify.android.appremote.api.SpotifyAppRemote;

import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.PlayerState;
import com.spotify.protocol.types.Track;


public class MainActivity extends AppCompatActivity {
    String spotifyClientId = "8fdef31808b8463cb3aae6b1f5edaa5f";
    String redirectUri = "https://www.google.com";
    private SpotifyAppRemote mSpotifyAppRemote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectionParams connectionParams =
                new ConnectionParams.Builder(spotifyClientId)
                        .setRedirectUri(redirectUri)
                        .showAuthView(true)
                        .build();

        SpotifyAppRemote.connect(this, connectionParams, new Connector.ConnectionListener() {
            @Override
            public void onConnected(SpotifyAppRemote spotifyAppRemote) {
                int z = 0;
            }

            @Override
            public void onFailure(Throwable throwable) {
                int a = 0;
            }
        });
    }
}