package com.meplus.speech.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by dandanba on 3/30/16.
 */
data class Trans(
        @JsonProperty("src") var src: String,
        @JsonProperty("dst") var dst: String
)