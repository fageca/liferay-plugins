/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.search.elasticsearch.util;

import com.liferay.util.portlet.PortletProps;

/**
 * @author Michael C. Han
 */
public class PortletPropsValues {

	public static final String ELASTICSEARCH_EMBEDDED_CONFIG_LOCATION =
		PortletProps.get(
			PortletPropsKeys.ELASTICSEARCH_EMBEDDED_CONFIG_LOCATION);

	public static final String ELASTICSEARCH_REMOTE_CONFIG_LOCATION =
		PortletProps.get(PortletPropsKeys.ELASTICSEARCH_REMOTE_CONFIG_LOCATION);

}