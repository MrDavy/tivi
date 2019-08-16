/*
 * Copyright 2017 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.tivi.home.discover

import app.tivi.data.resultentities.PopularEntryWithShow
import app.tivi.data.resultentities.RecommendedEntryWithShow
import app.tivi.data.resultentities.TrendingEntryWithShow
import app.tivi.tmdb.TmdbImageUrlProvider
import com.airbnb.mvrx.MvRxState

data class DiscoverViewState(
    val trendingItems: List<TrendingEntryWithShow> = emptyList(),
    val trendingRefreshing: Boolean = false,
    val popularItems: List<PopularEntryWithShow> = emptyList(),
    val popularRefreshing: Boolean = false,
    val recommendedItems: List<RecommendedEntryWithShow> = emptyList(),
    val recommendedRefreshing: Boolean = false,
    val tmdbImageUrlProvider: TmdbImageUrlProvider = TmdbImageUrlProvider()
) : MvRxState