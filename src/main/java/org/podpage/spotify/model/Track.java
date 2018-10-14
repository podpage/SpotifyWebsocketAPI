package org.podpage.spotify.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by podpage on 30.03.2018.
 */
public class Track {

    private String uri;
    private String uid;
    private MetadataBean metadata;

    public String getUri() {
        return uri;
    }

    public String getUid() {
        return uid;
    }

    public MetadataBean getMetadata() {
        return metadata;
    }

    public static class MetadataBean {
        private String album_artist_name;
        private String album_disc_count;
        private String album_disc_number;
        private String album_title;
        private String album_track_count;
        private String album_track_number;
        private String album_uri;
        private String artist_name;
        private String artist_uri;
        private String available_file_formats;
        @SerializedName("collection.can_add")
        private String _$CollectionCan_add69; // FIXME check this code
        @SerializedName("collection.in_collection")
        private String _$CollectionIn_collection42; // FIXME check this code
        private String context_uri;
        private String duration;
        private String entity_uri;
        private String has_lyrics;
        private String image_large_url;
        private String image_small_url;
        private String image_url;
        private String image_xlarge_url;
        private String is_explicit;
        private String is_local;
        private String iteration;
        private String popularity;
        private String title;

        public String getAlbum_artist_name() {
            return album_artist_name;
        }

        public String getAlbum_disc_count() {
            return album_disc_count;
        }

        public String getAlbum_disc_number() {
            return album_disc_number;
        }

        public String getAlbum_title() {
            return album_title;
        }

        public String getAlbum_track_count() {
            return album_track_count;
        }

        public String getAlbum_track_number() {
            return album_track_number;
        }

        public String getAlbum_uri() {
            return album_uri;
        }

        public String getArtist_name() {
            return artist_name;
        }

        public String getArtist_uri() {
            return artist_uri;
        }

        public String getAvailable_file_formats() {
            return available_file_formats;
        }

        public String get_$CollectionCan_add69() {
            return _$CollectionCan_add69;
        }

        public String get_$CollectionIn_collection42() {
            return _$CollectionIn_collection42;
        }

        public String getContext_uri() {
            return context_uri;
        }

        public String getDuration() {
            return duration;
        }

        public String getEntity_uri() {
            return entity_uri;
        }

        public String getHas_lyrics() {
            return has_lyrics;
        }

        public String getImage_large_url() {
            return image_large_url;
        }

        public String getImage_small_url() {
            return image_small_url;
        }

        public String getImage_url() {
            return image_url;
        }

        public String getImage_xlarge_url() {
            return image_xlarge_url;
        }

        public String getIs_explicit() {
            return is_explicit;
        }

        public String getIs_local() {
            return is_local;
        }

        public String getIteration() {
            return iteration;
        }

        public String getPopularity() {
            return popularity;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "MetadataBean{" +
                    "album_artist_name='" + album_artist_name + '\'' +
                    ", album_disc_count='" + album_disc_count + '\'' +
                    ", album_disc_number='" + album_disc_number + '\'' +
                    ", album_title='" + album_title + '\'' +
                    ", album_track_count='" + album_track_count + '\'' +
                    ", album_track_number='" + album_track_number + '\'' +
                    ", album_uri='" + album_uri + '\'' +
                    ", artist_name='" + artist_name + '\'' +
                    ", artist_uri='" + artist_uri + '\'' +
                    ", available_file_formats='" + available_file_formats + '\'' +
                    ", _$CollectionCan_add69='" + _$CollectionCan_add69 + '\'' +
                    ", _$CollectionIn_collection42='" + _$CollectionIn_collection42 + '\'' +
                    ", context_uri='" + context_uri + '\'' +
                    ", duration='" + duration + '\'' +
                    ", entity_uri='" + entity_uri + '\'' +
                    ", has_lyrics='" + has_lyrics + '\'' +
                    ", image_large_url='" + image_large_url + '\'' +
                    ", image_small_url='" + image_small_url + '\'' +
                    ", image_url='" + image_url + '\'' +
                    ", image_xlarge_url='" + image_xlarge_url + '\'' +
                    ", is_explicit='" + is_explicit + '\'' +
                    ", is_local='" + is_local + '\'' +
                    ", iteration='" + iteration + '\'' +
                    ", popularity='" + popularity + '\'' +
                    ", title='" + title + '\'' +
                    '}';
        }
    }
}
