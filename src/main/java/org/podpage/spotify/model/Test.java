package org.podpage.spotify.model;

import java.util.List;

public class Test {

    private DeviceStateBean device_state;
    private PlayerStateBean player_state;
    private AckBean ack;

    public DeviceStateBean getDevice_state() {
        return device_state;
    }

    public void setDevice_state(DeviceStateBean device_state) {
        this.device_state = device_state;
    }

    public PlayerStateBean getPlayer_state() {
        return player_state;
    }

    public void setPlayer_state(PlayerStateBean player_state) {
        this.player_state = player_state;
    }

    public AckBean getAck() {
        return ack;
    }

    public void setAck(AckBean ack) {
        this.ack = ack;
    }

    public static class DeviceStateBean {

        private String id;
        private String name;
        private String type;
        private String version;
        private int volume;
        private boolean is_active;
        private MetadataBean metadata;
        private boolean is_controllable;
        private boolean is_observable;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public double getVolume() {
            return volume / 655.35;
        }

        public int getSpotifyVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public boolean isIs_active() {
            return is_active;
        }

        public void setIs_active(boolean is_active) {
            this.is_active = is_active;
        }

        public MetadataBean getMetadata() {
            return metadata;
        }

        public void setMetadata(MetadataBean metadata) {
            this.metadata = metadata;
        }

        public boolean isIs_controllable() {
            return is_controllable;
        }

        public void setIs_controllable(boolean is_controllable) {
            this.is_controllable = is_controllable;
        }

        public boolean isIs_observable() {
            return is_observable;
        }

        public void setIs_observable(boolean is_observable) {
            this.is_observable = is_observable;
        }

        public static class MetadataBean {
            /**
             * disable_connect_api_compat : true
             * client_id : d8a5ed958d274c2e8ee717e6a4b0971d
             */

            private String disable_connect_api_compat;
            private String client_id;

            public String getDisable_connect_api_compat() {
                return disable_connect_api_compat;
            }

            public void setDisable_connect_api_compat(String disable_connect_api_compat) {
                this.disable_connect_api_compat = disable_connect_api_compat;
            }

            public String getClient_id() {
                return client_id;
            }

            public void setClient_id(String client_id) {
                this.client_id = client_id;
            }
        }
    }

    public static class PlayerStateBean {

        private long timestamp;
        private String context_uri;
        private String context_url;
        private ContextRestrictionsBean context_restrictions;
        private PlayOriginBean play_origin;
        private TrackBean track;
        private String playback_id;
        private IndexBean index;
        private int playback_speed;
        private int position_as_of_timestamp;
        private boolean is_playing;
        private boolean is_paused;
        private boolean is_system_initiated;
        private OptionsBean options;
        private RestrictionsBean restrictions;
        private SuppressionsBean suppressions;
        private ContextMetadataBean context_metadata;
        private PageMetadataBean page_metadata;
        private String session_id;
        private String queue_revision;
        private List<NextTracksBean> next_tracks;
        private List<PrevTracksBean> prev_tracks;

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public String getContext_uri() {
            return context_uri;
        }

        public void setContext_uri(String context_uri) {
            this.context_uri = context_uri;
        }

        public String getContext_url() {
            return context_url;
        }

        public void setContext_url(String context_url) {
            this.context_url = context_url;
        }

        public ContextRestrictionsBean getContext_restrictions() {
            return context_restrictions;
        }

        public void setContext_restrictions(ContextRestrictionsBean context_restrictions) {
            this.context_restrictions = context_restrictions;
        }

        public PlayOriginBean getPlay_origin() {
            return play_origin;
        }

        public void setPlay_origin(PlayOriginBean play_origin) {
            this.play_origin = play_origin;
        }

        public TrackBean getTrack() {
            return track;
        }

        public void setTrack(TrackBean track) {
            this.track = track;
        }

        public String getPlayback_id() {
            return playback_id;
        }

        public void setPlayback_id(String playback_id) {
            this.playback_id = playback_id;
        }

        public IndexBean getIndex() {
            return index;
        }

        public void setIndex(IndexBean index) {
            this.index = index;
        }

        public int getPlayback_speed() {
            return playback_speed;
        }

        public void setPlayback_speed(int playback_speed) {
            this.playback_speed = playback_speed;
        }

        public int getPosition_as_of_timestamp() {
            return position_as_of_timestamp;
        }

        public void setPosition_as_of_timestamp(int position_as_of_timestamp) {
            this.position_as_of_timestamp = position_as_of_timestamp;
        }

        public boolean isIs_playing() {
            return is_playing;
        }

        public void setIs_playing(boolean is_playing) {
            this.is_playing = is_playing;
        }

        public boolean isIs_paused() {
            return is_paused;
        }

        public void setIs_paused(boolean is_paused) {
            this.is_paused = is_paused;
        }

        public boolean isIs_system_initiated() {
            return is_system_initiated;
        }

        public void setIs_system_initiated(boolean is_system_initiated) {
            this.is_system_initiated = is_system_initiated;
        }

        public OptionsBean getOptions() {
            return options;
        }

        public void setOptions(OptionsBean options) {
            this.options = options;
        }

        public RestrictionsBean getRestrictions() {
            return restrictions;
        }

        public void setRestrictions(RestrictionsBean restrictions) {
            this.restrictions = restrictions;
        }

        public SuppressionsBean getSuppressions() {
            return suppressions;
        }

        public void setSuppressions(SuppressionsBean suppressions) {
            this.suppressions = suppressions;
        }

        public ContextMetadataBean getContext_metadata() {
            return context_metadata;
        }

        public void setContext_metadata(ContextMetadataBean context_metadata) {
            this.context_metadata = context_metadata;
        }

        public PageMetadataBean getPage_metadata() {
            return page_metadata;
        }

        public void setPage_metadata(PageMetadataBean page_metadata) {
            this.page_metadata = page_metadata;
        }

        public String getSession_id() {
            return session_id;
        }

        public void setSession_id(String session_id) {
            this.session_id = session_id;
        }

        public String getQueue_revision() {
            return queue_revision;
        }

        public void setQueue_revision(String queue_revision) {
            this.queue_revision = queue_revision;
        }

        public List<NextTracksBean> getNext_tracks() {
            return next_tracks;
        }

        public void setNext_tracks(List<NextTracksBean> next_tracks) {
            this.next_tracks = next_tracks;
        }

        public List<PrevTracksBean> getPrev_tracks() {
            return prev_tracks;
        }

        public void setPrev_tracks(List<PrevTracksBean> prev_tracks) {
            this.prev_tracks = prev_tracks;
        }

        public static class ContextRestrictionsBean {
        }

        public static class PlayOriginBean {
            /**
             * feature_identifier : harmony
             * feature_version : 3.5.0-1fb51bc
             */

            private String feature_identifier;
            private String feature_version;

            public String getFeature_identifier() {
                return feature_identifier;
            }

            public void setFeature_identifier(String feature_identifier) {
                this.feature_identifier = feature_identifier;
            }

            public String getFeature_version() {
                return feature_version;
            }

            public void setFeature_version(String feature_version) {
                this.feature_version = feature_version;
            }
        }

        public static class TrackBean {
            /**
             * uri : spotify:track:1kKHbvNRNxHJe1SdObEnbR
             * uid : a61fbf0961caa3a7fcd3
             * metadata : {"context_uri":"spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w","entity_uri":"spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w","iteration":"0"}
             * provider : context
             */

            private String uri;
            private String uid;
            private MetadataBeanX metadata;
            private String provider;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public MetadataBeanX getMetadata() {
                return metadata;
            }

            public void setMetadata(MetadataBeanX metadata) {
                this.metadata = metadata;
            }

            public String getProvider() {
                return provider;
            }

            public void setProvider(String provider) {
                this.provider = provider;
            }

            public static class MetadataBeanX {
                /**
                 * context_uri : spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w
                 * entity_uri : spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w
                 * iteration : 0
                 */

                private String context_uri;
                private String entity_uri;
                private String iteration;

                public String getContext_uri() {
                    return context_uri;
                }

                public void setContext_uri(String context_uri) {
                    this.context_uri = context_uri;
                }

                public String getEntity_uri() {
                    return entity_uri;
                }

                public void setEntity_uri(String entity_uri) {
                    this.entity_uri = entity_uri;
                }

                public String getIteration() {
                    return iteration;
                }

                public void setIteration(String iteration) {
                    this.iteration = iteration;
                }
            }
        }

        public static class IndexBean {
            /**
             * page : 0
             * track : 1
             */

            private int page;
            private int track;

            public int getPage() {
                return page;
            }

            public void setPage(int page) {
                this.page = page;
            }

            public int getTrack() {
                return track;
            }

            public void setTrack(int track) {
                this.track = track;
            }
        }

        public static class OptionsBean {
            /**
             * shuffling_context : false
             * repeating_context : false
             * repeating_track : false
             */

            private boolean shuffling_context;
            private boolean repeating_context;
            private boolean repeating_track;

            public boolean isShuffling_context() {
                return shuffling_context;
            }

            public void setShuffling_context(boolean shuffling_context) {
                this.shuffling_context = shuffling_context;
            }

            public boolean isRepeating_context() {
                return repeating_context;
            }

            public void setRepeating_context(boolean repeating_context) {
                this.repeating_context = repeating_context;
            }

            public boolean isRepeating_track() {
                return repeating_track;
            }

            public void setRepeating_track(boolean repeating_track) {
                this.repeating_track = repeating_track;
            }
        }

        public static class RestrictionsBean {
        }

        public static class SuppressionsBean {
        }

        public static class ContextMetadataBean {
        }

        public static class PageMetadataBean {
        }

        public static class NextTracksBean {
            /**
             * uri : spotify:track:0sPJELXHyWpFgkxlzvvRFI
             * uid : da6f076d3d931d79bc97
             * metadata : {"context_uri":"spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w","entity_uri":"spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w","iteration":"0"}
             * provider : context
             */

            private String uri;
            private String uid;
            private MetadataBeanXX metadata;
            private String provider;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public MetadataBeanXX getMetadata() {
                return metadata;
            }

            public void setMetadata(MetadataBeanXX metadata) {
                this.metadata = metadata;
            }

            public String getProvider() {
                return provider;
            }

            public void setProvider(String provider) {
                this.provider = provider;
            }

            public static class MetadataBeanXX {
                /**
                 * context_uri : spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w
                 * entity_uri : spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w
                 * iteration : 0
                 */

                private String context_uri;
                private String entity_uri;
                private String iteration;

                public String getContext_uri() {
                    return context_uri;
                }

                public void setContext_uri(String context_uri) {
                    this.context_uri = context_uri;
                }

                public String getEntity_uri() {
                    return entity_uri;
                }

                public void setEntity_uri(String entity_uri) {
                    this.entity_uri = entity_uri;
                }

                public String getIteration() {
                    return iteration;
                }

                public void setIteration(String iteration) {
                    this.iteration = iteration;
                }
            }
        }

        public static class PrevTracksBean {
            /**
             * uri : spotify:track:34nw5BCrCKN6nVrL4Zaong
             * uid : 1a5ffc27b7d0103fb5b4
             * metadata : {"context_uri":"spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w","entity_uri":"spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w","iteration":"0"}
             * provider : context
             */

            private String uri;
            private String uid;
            private MetadataBeanXXX metadata;
            private String provider;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public MetadataBeanXXX getMetadata() {
                return metadata;
            }

            public void setMetadata(MetadataBeanXXX metadata) {
                this.metadata = metadata;
            }

            public String getProvider() {
                return provider;
            }

            public void setProvider(String provider) {
                this.provider = provider;
            }

            public static class MetadataBeanXXX {
                /**
                 * context_uri : spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w
                 * entity_uri : spotify:user:spotify:playlist:37i9dQZEVXbe4dxMFAUb2w
                 * iteration : 0
                 */

                private String context_uri;
                private String entity_uri;
                private String iteration;

                public String getContext_uri() {
                    return context_uri;
                }

                public void setContext_uri(String context_uri) {
                    this.context_uri = context_uri;
                }

                public String getEntity_uri() {
                    return entity_uri;
                }

                public void setEntity_uri(String entity_uri) {
                    this.entity_uri = entity_uri;
                }

                public String getIteration() {
                    return iteration;
                }

                public void setIteration(String iteration) {
                    this.iteration = iteration;
                }
            }
        }
    }

    public static class AckBean {
        /**
         * id : p0FPtX0GXKnpWFZX5RS5UdGj6PE
         */

        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
