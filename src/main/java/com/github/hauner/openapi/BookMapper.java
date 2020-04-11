/*
 * Copyright 2020 the original authors
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

package com.github.hauner.openapi;

import com.github.hauner.openapi.model.Book;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Mapper (componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BookMapper {

    Book toResource (com.github.hauner.openapi.Book source);

    default String toResource (Author source) {
        return source.getName ();
    }

    com.github.hauner.openapi.Book toDomain (Book book);

    default List<Author> toDomain (String[] authors) {
        return Stream.of (authors)
            .map (a -> {
                Author author = new Author ();
                author.setName (a);
                return author;
            })
            .collect(Collectors.toList());
    }

}
