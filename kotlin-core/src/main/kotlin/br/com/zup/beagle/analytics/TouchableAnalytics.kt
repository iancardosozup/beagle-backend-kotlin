/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
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

package br.com.zup.beagle.analytics

/**
 * Component that hold the click analytics
 * @property clickAnalyticsEvent attribute to define click event name
 */

@Deprecated("It was deprecated in version 1.10.0 and will be removed in a future version." +
    " Use the new analytics.")
interface TouchableAnalytics {

    @Deprecated("It was deprecated in version 1.10.0 and will be removed in a future version." +
        " Use the new analytics.")
    val clickAnalyticsEvent: ClickEvent?
}
