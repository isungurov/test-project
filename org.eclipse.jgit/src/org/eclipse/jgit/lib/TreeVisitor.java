/*
 * Copyright (C) 2007, Robin Rosenberg <robin.rosenberg@dewire.com>
 * Copyright (C) 2007, Shawn O. Pearce <spearce@spearce.org>
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the following
 * conditions are met:
 *
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above
 *   copyright notice, this list of conditions and the following
 *   disclaimer in the documentation and/or other materials provided
 *   with the distribution.
 *
 * - Neither the name of the Eclipse Foundation, Inc. nor the
 *   names of its contributors may be used to endorse or promote
 *   products derived from this software without specific prior
 *   written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.eclipse.jgit.lib;

import java.io.IOException;

/**
 * A TreeVisitor is invoked depth first for every node in a tree and is expected
 * to perform different actions.
 */
public interface TreeVisitor {
	/**
	 * Visit to a tree node before child nodes are visited.
	 *
	 * @param t
	 *            Tree
	 * @throws IOException
	 */
	public void startVisitTree(final Tree t) throws IOException;

	/**
	 * Visit to a tree node. after child nodes have been visited.
	 *
	 * @param t Tree
	 * @throws IOException
	 */
	public void endVisitTree(final Tree t) throws IOException;

	/**
	 * Visit to a blob.
	 *
	 * @param f Blob
	 * @throws IOException
	 */
	public void visitFile(final FileTreeEntry f) throws IOException;

	/**
	 * Visit to a symlink.
	 *
	 * @param s Symlink entry
	 * @throws IOException
	 */
	public void visitSymlink(final SymlinkTreeEntry s) throws IOException;

	/**
	 * Visit to a gitlink.
	 *
	 * @param s Gitlink entry
	 * @throws IOException
	 */
	public void visitGitlink(final GitlinkTreeEntry s) throws IOException;
}
