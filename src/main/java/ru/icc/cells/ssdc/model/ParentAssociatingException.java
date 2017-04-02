/*
 * Copyright 2015 Alexey O. Shigarov (shigarov@icc.ru)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.icc.cells.ssdc.model;

/**
 * Created by shig on 03.03.2015.
 */

public abstract class ParentAssociatingException extends Exception
{
	/**
	 *
	 */
	private static final long serialVersionUID = 3383852680564662219L;

	protected ParentAssociatingException( CLabel child, CLabel parent, CLabel failedParent, String message )
    {
        super( String.format( "%s [child: \"%s\"; parent: \"%s\"; failed parent: \"%s\"]",
               message, child.getValue(), parent.getValue(), failedParent.getValue() ) );
    }
}
